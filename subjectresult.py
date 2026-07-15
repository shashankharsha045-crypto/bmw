s1=float(input("enter sub1 mrks="))
s2=float(input("enter sub2 marks="))
s3=float(input("enter sub3 marks="))
s4=float(input("enter sub4 marks="))
s5=float(input("enter sub5 marks="))
total=s1+s2+s3+s4+s5
percentage=(total/450)*100.00
if(s1>=40)and(s2>=40)and(s3>=40)and(s4>=40)and(s5>=40):
   if(s1<=100)and(s2<=100)and(s3<=100)and(s4<=100)and(s5<=100):
     if(percentage>=75.00):
         print("first class with distinction")
     elif(percentage<75.00 and percentage>=60.00):
         print("first class")
     elif(percentage<60.00 and percentage>=50.00):
         print("second class")
     else:
         print("pass class")
   else:
         print("invalied mrks")
else:
         print("your are failed")
         
         
         
        
         
         

    
    
 