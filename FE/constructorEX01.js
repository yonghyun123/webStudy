
var healthObj = {
    name : "용현",
    lastTime : "PM10:12",
    showHealth : function() {
      console.log(this.name + "님, 오늘은 " + this.lastTime + "에 운동을 하셨네요");
    }
  }
  
var healthObj2 = {
  name : "기경",
  lastTime : "PM09:12",
  showHealth : function() {
    console.log(this.name + "님, 오늘은 " + this.lastTime + "에 운동을 하셨네요");
  }
}
  healthObj.showHealth();
  healthObj2.showHealth();

  //--------------------------------생성자 사용----------------------
  function Health(name, time){
    this.name = name;
    this.time = time;
    this.showHealth = function(){
      return this.name + "님" + this.time + "에 운동하셨네여";
    }
    //return this;
  }
  var o = new Health("용현","am09:00");
  var o2 = new Health("진현","am09:00");
  console.log(o===o2); //false

  //-------------------------------prototype 사용----------------------

  function Health(name, time){
    this.name = name;
    this.time = time;
    //return this;
  }
  Health.prototype.showHealth = function(){
    return this.name + "님" + this.time + "에 운동하셨네여";
  }
  var o = new Health("용현","am09:00");
  var o2 = new Health("진현","am09:00");
  console.log(o.showHealth===o2.showHealth); //true