public class SubsidiaryCompany {
    private String nameSubsidiaryCompany;
    private double forecastIndicator;
    private double actualIndicator;
    private double percentageOfCompletion;

    public SubsidiaryCompany(String nameSubsidiaryCompany, double forecastIndicator, double actualIndicator) {
        this.nameSubsidiaryCompany = nameSubsidiaryCompany;
        this.forecastIndicator = forecastIndicator;
        this.actualIndicator = actualIndicator;
    }
    public String getNameSubsidiaryCompany() {
        return nameSubsidiaryCompany;
    }
    public double getForecastIndicator() {
        return forecastIndicator;
    }
    public void setForecastIndicator(double forecastIndicator) {
        this.forecastIndicator = forecastIndicator;
    }
    public double getActualIndicator() {
        return actualIndicator;
    }
    public void setActualIndicator(double actualIndicator) {
        this.actualIndicator = actualIndicator;
    }
    public void viewInfoSubsidiaryCompany(){
        System.out.println("SubsidiaryCompany: "+ nameSubsidiaryCompany +
                " forecastIndicator: " + forecastIndicator +
                " actualIndicator: " + actualIndicator +
                " PercentageOfCompletion: " + getActualIndicator()+"%");
    }
    private double getPercentageOfCompletion(){
        percentageOfCompletion = (actualIndicator/actualIndicator)*100;
        return  percentageOfCompletion;
    }

}
