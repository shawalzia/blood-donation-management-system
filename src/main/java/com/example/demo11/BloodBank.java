package com.example.demo11;

import java.io.*;
import java.util.*;

public class BloodBank {


    private ArrayList<Donor> donor ;
    private ArrayList<Donor> donorReport ;
    private ArrayList<BloodRequest> bloodRequests  ;
    private ArrayList<BloodRequest> bloodRequestsReport ;
    private ArrayList<Recipient> recipientsReport ;
    private ArrayList<BloodBag> Inventory;
    private ArrayList<BloodBag> InventoryReport ;
    private ArrayList<Recipient> recipients;
    private ArrayList<Login> logins;

    public BloodBank() {
        donorReport=loadDonorsFromFile();
        bloodRequestsReport = loadRecquestsFromFile();
        recipientsReport= loadRecipientsFromFile();
        InventoryReport=loadAllBagsFromFile();
        donor = new ArrayList<>();
        loadDonorsFromFile();
        Inventory = new ArrayList<>();
        loadAllBagsFromFile();
        recipients = new ArrayList<>();
        loadRecipientsFromFile();
        logins = new ArrayList<>();
        bloodRequests = new ArrayList<>();
        loadRecquestsFromFile();
    }

    public ArrayList<BloodRequest> getBloodRequestsReport() {
        return bloodRequestsReport;
    }


    public ArrayList<BloodBag> getInventoryReport() {
        return InventoryReport;
    }

    public ArrayList<Donor> getDonorReport() {
        return donorReport;
    }

    public ArrayList<Login> getLogins() {
        return logins;
    }

    public ArrayList<Recipient> getRecipientsReport() {
        return recipientsReport;
    }

    public ArrayList<Donor> getDonor() {
        return donor;
    }

    public ArrayList<BloodBag> getInventory() {
        return Inventory;
    }

    public ArrayList<Recipient> getRecipient() {
        return recipients;
    }

    public ArrayList<BloodRequest> getBloodRequests() {
        return bloodRequests;
    }





    public void makeaRequest(BloodRequest r){
        bloodRequests.add(r);
        saveAllRequestsToFile();
    }
    private void saveAllRequestsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("requests.dat"))) {
            oos.writeObject(bloodRequests);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    private ArrayList<BloodRequest> loadRecquestsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("requests.dat"))) {
            bloodRequests = (ArrayList<BloodRequest>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bloodRequests;
    }

    private void saveAllRecipientsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("recipient.dat"))) {
            oos.writeObject(recipients);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to load donors from file
    @SuppressWarnings("unchecked")
    private ArrayList<Recipient> loadRecipientsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("recipient.dat"))) {
            recipients = (ArrayList<Recipient>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return recipients;
    }


    public void updateRecipient(String name, String newname, Contact newContact, Address newAddress, int age) throws RecepientNotFoundException {
        loadRecipientsFromFile();

        // Find the recipient to update
        Recipient recipientToUpdate = findRecipientByName(name);

        // Check if the recipient exists
        if (recipientToUpdate == null) {
            throw new RecepientNotFoundException("No such person exists");
        }

        // Update the recipient
        updateRecipientInfo(recipientToUpdate, newname, newContact, newAddress, age);

        // Save the updated list of recipients to file
        saveAllRecipientsToFile();
    }

    private Recipient findRecipientByName(String name) {
        for (Recipient recipient : recipients) {
            if (recipient.getName().equalsIgnoreCase(name)) {
                return recipient;
            }
        }
        return null; // Return null if recipient not found
    }

    private void updateRecipientInfo(Recipient recipient, String newname, Contact newContact, Address newAddress, int age) {
        // Update recipient's information
        recipient.setName(newname);
        recipient.setContact(newContact);
        recipient.setAddress(newAddress);
        recipient.setAge(age);
    }

    public void addRecipient(Recipient d) {
        recipients.add(d);
        saveAllRecipientsToFile();
        System.out.println("Recipient Added!");
    }
    public void removeRecipient(String name) throws RecepientNotFoundException {
        boolean found = false;
        loadRecipientsFromFile(); // Load the recipients from the file

        for (int i = 0; i < recipients.size(); i++) {
            if (recipients.get(i).getName().equalsIgnoreCase(name)) {
                recipients.remove(i);
                found = true;
                break;
            }
        }

        if (!found) {
            throw new RecepientNotFoundException("Recipient not found");
        }

        saveAllRecipientsToFile(); // Save the updated list back to the file
    }



    public void updateDonor(String name, String newName, Address newAddress, int age) throws DonorNotFoundException {
        loadDonorsFromFile();

        Donor donorToUpdate = findDonorByName(name);

        if (donorToUpdate == null) {
            throw new DonorNotFoundException("No such donor found!");
        }

        updateDonorInfo(donorToUpdate, newName, newAddress, age);

        saveAllDonorsToFile();
    }

    private Donor findDonorByName(String name) {
        for (Donor donor : donor) {
            if (donor.getName().equalsIgnoreCase(name)) {
                return donor;
            }
        }
        return null;
    }

    private void updateDonorInfo(Donor donor, String newName, Address newAddress, int age) {

        donor.setName(newName);
        donor.setAddress(newAddress);
        donor.setAge(age);
    }

    public void deleteDonor(String name) throws DonorNotFoundException, IOException {
        boolean found = false;


        loadDonorsFromFile();


        for (int i = 0; i < donor.size(); i++) {
            if (donor.get(i).getName().equalsIgnoreCase(name)) {
                donor.remove(i);
                found = true;
                break;
            }
        }


        saveAllDonorsToFile();

        if (!found) {
            throw new DonorNotFoundException("No donor found with the name " + name);
        }
    }

    private void saveAllDonorsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("donors.dat"))) {
            oos.writeObject(donor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addDonor(Donor d) throws IOException {
        donor.add(d);
        saveAllDonorsToFile();

    }

    private ArrayList<Donor> loadDonorsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("donors.dat"))) {
            donor =  (ArrayList<Donor>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return donor ;
    }

    private void saveAllBagsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bags.dat"))) {
            oos.writeObject(Inventory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addBloodBag(BloodBag b) {
        Inventory.add(b);
        saveAllBagsToFile();
    }

    @SuppressWarnings("unchecked")
    private ArrayList<BloodBag> loadAllBagsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bags.dat"))) {
            Inventory = (ArrayList<BloodBag>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Inventory;
    }
    public void removeBloodBag(String id) throws BloodBagNotFoundException{
        boolean found=false;

        loadAllBagsFromFile();
        for (int i = 0; i < Inventory.size(); i++){
            if (Inventory.get(i).getBagId().equalsIgnoreCase(id)) {
                Inventory.remove(i);
                found=true;
            }
        }
        saveAllBagsToFile();
        if(!found){
            throw new BloodBagNotFoundException("bag not found!");
        }
    }
    public int searchBloodBag(BloodGroup bloodGroup) throws BloodBagNotFoundException {
        for (int i = 0; i < Inventory.size(); i++) {
            BloodBag b = Inventory.get(i);
            if (b.getBloodGroup().equals(bloodGroup)) {
                if (b.getisAvailaible()) {
                    return i;
                }
            }
        }
        throw new BloodBagNotFoundException("No blood bags found .");
    }
    public void updateBloodBag(String bagId, int newQuantity) throws BloodBagNotFoundException {
        boolean found = false;

        // Load the blood bag inventory from the file
        loadAllBagsFromFile();

        // Iterate over the inventory to find the blood bag with the specified ID
        for (BloodBag bag : Inventory) {
            if (bag.getBagId().equals(bagId)) {
                found = true;
                bag.setQuantity(newQuantity); // Update the quantity of the blood bag
                break;
            }
        }

        // If the blood bag is not found, throw an exception
        if (!found) {
            throw new BloodBagNotFoundException("Blood bag " + bagId + " not found in the inventory.");
        }

        // Save the updated inventory back to the file
        saveAllBagsToFile();
    }


    public boolean checkBloodAvailability(BloodGroup type,int quantity){ int availableQuantity = 0;
        for (BloodBag bag : Inventory) {
            if (bag.getBloodGroup() == type && bag.getisAvailaible()) {
                availableQuantity += bag.getQuantity();
            }
        }
        return availableQuantity >= quantity;

    }

    public boolean performTransfusion(int id, BloodGroup type, int quantity)  throws RecepientNotFoundException,InsufficientBloodException{
        boolean found = false;
        loadRecipientsFromFile();
        for (Recipient r : recipients) {
            if (r.getId() == id) {
                found = true;
                break;
            }
        }
        if (!found) {
            throw new RecepientNotFoundException("Recepient with " +id+" does not exists");
        }

        int availableQuantity = 0;
        loadAllBagsFromFile();
        for (BloodBag bag : Inventory) {
            if (bag.getBloodGroup().equals(type) ) {
                if (bag.getisAvailaible() ) {
                    availableQuantity += bag.getQuantity();
                }
            }
        }
        if (availableQuantity < quantity) {
            throw new InsufficientBloodException("Error: Insufficient blood available for transfusion!");
        } else {
            int remainingQuantity = quantity;
            Iterator<BloodBag> iterator = Inventory.iterator();
            while (iterator.hasNext()) {
                BloodBag bag = iterator.next();
                if (bag.getBloodGroup().equals(type) && bag.getisAvailaible()) {
                    int bagQuantity = bag.getQuantity();
                    if (bagQuantity <= remainingQuantity) {
                        bag.setisAvailaible(false);
                        remainingQuantity -= bagQuantity;
                        iterator.remove();
                    } else {
                        bag.setQuantity(bagQuantity - remainingQuantity);
                        remainingQuantity = 0;
                        break;
                    }
                }
            }
            saveAllBagsToFile();
            return true;
        }
    }



    public int searchDonor(String name) throws DonorNotFoundException {

        for (int i = 0; i < donor.size(); i++) {
            if (donor.get(i).getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        throw  new DonorNotFoundException("Donor Not Found Exception ");
    }


    public int searchRecepient(String name)throws RecepientNotFoundException{
        for(int i=0;i < recipients.size();i++){
            if(recipients.get(i).getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        throw new RecepientNotFoundException("Recipient Not Found Exception ");

    }
    public ArrayList<Donor> searchDonorsOfSameBloodType(BloodGroup b){
        ArrayList<Donor> arr = new ArrayList<>();
        loadDonorsFromFile();
        for (Donor d: donor){
            if (d.getBloodGroup().getType().equalsIgnoreCase(b.getType()) &&
                    d.getBloodGroup().getRhFactor().equalsIgnoreCase(b.getRhFactor())) {
                arr.add(d);
            }
        }
        return arr;
    }

    public void createAccount(Login l) throws UserNameException, PasswordException, NotSamePasswordException {
        if (l.getUserName().length() < 6 || l.getUserName().length() > 20 || !l.getUserName().matches("^[a-zA-Z0-9]+$")) {
            throw new UserNameException("User Name must be alphanumeric and contain 6 - 20 characters");
        }
        if (l.getPassword().length() < 8 || l.getPassword().length() > 20 || !l.getPassword().matches("^(?=.[0-9])(?=.[A-Z])(?=.[@#$%^&+-])(?=.*[a-z])(?=\\S+$).{8,}$")) {
            throw new PasswordException("Password 8 characters 1 uppercase, 1 lowercase, 1 digit, and 1 special character");
        }
        if (!l.getPassword().equalsIgnoreCase(l.getPassword2())){
            throw new NotSamePasswordException("Password should be same");
        }

        logins.add(l);
    }
}




