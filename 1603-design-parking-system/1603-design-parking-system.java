class ParkingSystem {
    
    //int bigSlots, mediumSlots, smallSlots;
    Map<Integer, Integer> typeToSlotsMap = new HashMap<>();

    public ParkingSystem(int big, int medium, int small) {
        // this.bigSlots=big;
        // this.mediumSlots=medium;
        // this.smallSlots=small;
        typeToSlotsMap.put(1, big);
        typeToSlotsMap.put(2, medium);
        typeToSlotsMap.put(3, small);
        
    }
    
    public boolean addCar(int carType) {
        if(typeToSlotsMap.containsKey(carType) && typeToSlotsMap.get(carType)>0){
            typeToSlotsMap.put(carType, typeToSlotsMap.get(carType)-1);
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */