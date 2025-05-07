package School.Experiment5.example1;

public class MultiSeasonsCrop extends Crop {
    private String status;
    private int multiSeasonCrop;
    private int currentSeason;
    private boolean[] harvested;
    public MultiSeasonsCrop(String name, int maturity, int numsOfFruits, int harvestTime,int multiSeasonCrop){
        super(name,maturity,numsOfFruits,harvestTime);
        this.multiSeasonCrop = multiSeasonCrop;
        this.status = Constants.GROW;
        this.harvested = new boolean[this.multiSeasonCrop];
    }
    @Override
    public void print(){
        super.print();
        System.out.println("属于"+this.multiSeasonCrop+"季作物");
    }
    @Override
    public void grow(int days){
        int seasonDuration = super.getMaturity()
                + super.getHarvestTime();//计算单个生长季周期
        if(days >= multiSeasonCrop*seasonDuration){
            this.status = Constants.DEAD;
        }else{
            currentSeason = days / seasonDuration + 1;//计算当前处于第几个生长季
            int growDaysInCurrSeason = days
                    - (currentSeason -1 )* seasonDuration;//计算在当前生长季的生长时间
            if(growDaysInCurrSeason >= super.getMaturity() ){
                this.status = Constants.MATURE;
            }else{
                this.status = Constants.GROW;
            }
        }
    }
    @Override
    public void printGrowReport(int days) {
        System.out.println("您种植的" + super.getName() + "处于"
                + this.currentSeason + "季" + this.status);
        switch(this.status){
            case Constants.GROW:
                int seasonDuration = super.getMaturity() + super.getHarvestTime();
                int growDaysInCurrSeason = days -
                        (currentSeason - 1) * seasonDuration;
                System.out.println("已生长" + growDaysInCurrSeason
                        + "天,距离收获果实还有"
                        + (super.getMaturity() - growDaysInCurrSeason) + "天");
                break;
            case Constants.MATURE:
                if(harvested[currentSeason-1]==true){
                    System.out.println("本季果实已完成采摘！");
                }else{
                    System.out.println("果实已成熟，请尽快采摘！");
                }
                break;
        }
    }

    public String getStatus() {
        return status;
    }

    public int getMultiSeasonCrop() {
        return multiSeasonCrop;
    }

    public int getCurrentSeason() {
        return currentSeason;
    }

    public boolean[] getHarvested() {
        return harvested;
    }
}
