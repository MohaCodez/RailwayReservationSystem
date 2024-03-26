class TrainRoute {
    private String startPoint;
    private String endPoint;
    private double distance;

    TrainRoute(String startPoint, String endPoint, double distance) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.distance = distance;
    }

    public String getStartPoint(){
      return this.startPoint;
    }
    public String getEndPoint(){
      return this.endPoint;
    }
    public String getDistance(){
      return this.distance;
    }
}
