package Models;
//You would create an instance of ComputeEngineConfig in your test classes and use it to populate the
// calculator form:

public class ComputeEngineConfig {
    private int numberOfInstances;
    private String purpose;
    private String operatingSystem;
    private String vmClass;
    private String instanceType;
    private boolean addGPUs;
    private int numberOfGPUs;
    private String gpuType;
    private String localSSD;
    private String datacenterLocation;
    private String committedUsage;

    // Constructor
    public ComputeEngineConfig() {
        this.numberOfInstances = 4; // default value
        this.purpose = ""; // leave blank
        this.operatingSystem = "Free: Debian, CentOS, CoreOS, Ubuntu, or another User-Provided OS";
        this.vmClass = "Regular";
        this.instanceType = "n1-standard-8"; // vCPUs: 8, RAM: 30 GB
        this.addGPUs = true; // default to true
        this.numberOfGPUs = 1; // default value
        this.gpuType = "NVIDIA Tesla V100";
        this.localSSD = "2x375 Gb";
        this.datacenterLocation = "Frankfurt (europe-west3)";
        this.committedUsage = "1 Year";
    }

    // Getters and Setters
    public int getNumberOfInstances() {
        return numberOfInstances;
    }

    public void setNumberOfInstances(int numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getVmClass() {
        return vmClass;
    }

    public void setVmClass(String vmClass) {
        this.vmClass = vmClass;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
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

    public String getLocalSSD() {
        return localSSD;
    }

    public void setLocalSSD(String localSSD) {
        this.localSSD = localSSD;
    }

    public String getDatacenterLocation() {
        return datacenterLocation;
    }

    public void setDatacenterLocation(String datacenterLocation) {
        this.datacenterLocation = datacenterLocation;
    }

    public String getCommittedUsage() {
        return committedUsage;
    }

    public void setCommittedUsage(String committedUsage) {
        this.committedUsage = committedUsage;
    }
}
