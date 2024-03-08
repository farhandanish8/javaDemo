//package com.voterapp.service;
//
//public class ElectionBoothServiceImpl implements IElectionBoothService{
//    @Override
//    public boolean checkEligibility(int age, String locality, int voterId) throws UnderAgeException, InvalidVoterIdException, LocalityNotFoundException {
//        checkAge(age);
//        checkLocality(locality);
//        checkVoterId(voterId);
//        return false;
//    }
//    public void checkAge(int age) throws UnderAgeException{
//        if(age<18){
//            throw new UnderAgeException("Age should be greater than 18");
//
//            }
//        }
//        public void checkLocality(String locality)
//            throws LocalityNotFoundException{
//        String[] localities = {"Rajajinagara","Laggere","Devanahalli","Yelahanka","JP nagara","WhiteField"};
//        boolean found = false;
//        for(String location : localities){
//            if (location.equals(locality)){
//                found=true;
//                System.out.println(location);
//                break;
//            }
//        }
//        if(!found){
//            throw new LocalityNotFoundException("Locality not found");
//        }
//    }
//    public void checkVoterId(int voterId)
//        throws InvalidVoterIdException{
//        if(voterId<=0){
//            throw new InvalidVoterIdException("Voter id not found");
//        }
//    }
//}
