package Models;
//You would create an instance of ComputeEngineConfig in your test classes and use it to populate the
// calculator form:

public class ComputeEngineConfig {
    private int numberOfInstances;
    private String machineType;
    private boolean addGPUs;
    private int numberOfGPUs;
    private String gpuType;
    private String datacenterLocation;

    // Constructor
    public ComputeEngineConfig() {
        this.numberOfInstances = 4;
        this.machineType = "n1-standard-8"; // vCPUs: 8, RAM: 30 GB
        this.addGPUs = true; // default to true
        this.numberOfGPUs = 1; // default value
        this.gpuType = "NVIDIA Tesla V100";
        this.datacenterLocation = "Frankfurt (europe-west3)";
    }

    // Getters and Setters
    public int getNumberOfInstances() {
        return numberOfInstances;
    }

    public void setNumberOfInstances(int numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }
    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public boolean isAddGPUs() {
        return addGPUs;
    }

    public void setAddGPUs(boolean addGPUs) {
        this.addGPUs = addGPUs;
    }

    public int getNumberOfGPUs() {
        return numberOfGPUs;
    }

    public void setNumberOfGPUs(int numberOfGPUs) {
        this.numberOfGPUs = numberOfGPUs;
    }

    public String getGpuType() {
        return gpuType;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType;
    }

    public String getDatacenterLocation() {
        return datacenterLocation;
    }

    public void setDatacenterLocation(String datacenterLocation) {
        this.datacenterLocation = datacenterLocation;
    }
}
