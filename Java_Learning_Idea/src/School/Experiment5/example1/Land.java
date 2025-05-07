package School.Experiment5.example1;


public class Land {
    private boolean idle = true;   //默认为“空闲”状态
    private Crop crop;             //种植的作物
    /**
     * 种植作物
     */
    public void plant(Crop crop){
        if(!idle){
            System.out.println("土地被占用，目前无法种植新的作物！");
            return;
        }
        this.crop = crop;
        this.idle = false;
        System.out.println("您已成功种植了一棵"+ this.crop.getName());
        this.crop.print();
    }

    public boolean isIdle() {
        return idle;
    }

    public void setIdle(boolean idle) {
        this.idle = idle;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }
}
