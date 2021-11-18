class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer =manufacturer
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color
    
    def accelerate(self):
        print(self.manufacturer +" "+ self.model + " is moving")
    
    def stop(self):
        print(self.manufacturer +" "+ self.model + " has stopped")
 
c1 = Car("HyundayiMotor", "Venue", "Hyundai","Automatic", "Silver" )
c2 = Car("Tata", "VX", "Hexa","Automatic", "Black" )
c3 = Car("Maruti", "Breza", "Suzuki","Manual", "White")

 
c1.accelerate()
c1.stop()
c2.accelerate()
c2.stop()
c3.accelerate()
c3.stop()