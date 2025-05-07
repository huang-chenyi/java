package School.Experiment5.example1;

public class SingleSeasonCrop extends Crop {
    private String status;
    private boolean harvested;
    public SingleSeasonCrop(String name, int maturity, int numsOfFruits, int harvestTime){
        super(name,maturity,numsOfFruits,harvestTime);
        this.status = Constants.GROW;
        this.harvested = false;
    }
    @Override
    public void grow(int days){
        int seasonDuration = super.getMaturity() + super.getHarvestTime();//计算单个生长季周期
        if(days >= seasonDuration){
            this.status = Constants.DEAD;
        }else{
            if(days >= super.getMaturity() ){
                this.status = Constants.MATURE;
            }else{
                this.status = Constants.GROW;
            }
        }
    }
    @Override
    public void printGrowReport(int days){
        System.out.println("您种植的" + super.getName() + "处于" + this.status);
        switch(this.status){
            case Constants.GROW:
                System.out.println("已生长" + days
                        + "天,距离收获果实还有"
                        + (super.getMaturity() - days) + "天");
                break;
            case Constants.MATURE:
                if(harvested==true){
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

    public boolean isHarvested() {
        return harvested;
    }
}
