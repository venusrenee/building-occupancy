public class Building
{
    private String name; 
    private int occCapacity;
    private int occPresent;

    public Building(String newName, int newCapacity)
    {
        name = newName;
        occCapacity= newCapacity;
        occPresent = 0;
    }
    
    public void addOccupants(int arrivingOcc)
    { 
        if (occPresent + arrivingOcc > occCapacity){
            System.out.println("Number of occupants cannot exceed capacity." 
            + " Command ignored.");
        }
        else{
            occPresent += arrivingOcc;
        }
    }
    
    public void subtractOccupants(int departingOcc)
    { 
        if(occPresent - departingOcc < 0){
            System.out.println("Number of occupants cannot be fewer than 0."
            + " Command ignored.");
        }
        else{
            occPresent -= departingOcc;
        }
    }
    
    public void printStatus()
    {
        System.out.println(name + " currently has " + occPresent + " of " +
        occCapacity + " people present.");
    }
}

