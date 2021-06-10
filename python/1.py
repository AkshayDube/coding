
rows=int(input("Enter rows : "))
cols=int(input("Enter cols : "))

#Rectangle
for i in range(rows):
    for j in range(cols):
        print("* ",end="")
    print()    

#Hollow Rectangle
print("-------------------------------") 

for i in range(1,rows+1):
    for j in range(1,cols+1):
        if(i==1 or i==rows or j==1 or j==cols):
            print("* ",end="")
        else:
            print("  ",end="")  
    print()          