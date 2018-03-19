#Written in Python 3.6.1
#By Molly Mason
#Problem Solving for CS 2017 assignment

Obj = input("Please enter the object names: ").split() #User input for objects
S0 = input("Please enter the initial state: ").split()
G = input("Please enter the goal: ").split()

objdict = {} #Clear dictionary for objects

for element in Obj:
	objdict[element] = {"On":None, "Weight":None, "Clear":None, "Above":None, "Under":None}
	#Created attributes for each object
	
for eachthing in S0:
	if eachthing[0] == "O": #Identifies 'ON' proposition
		a = eachthing.split("(")
		b = a[1].split(")")[0]
		b = b.split(',')
		above = b[0] #Object that is on top of under
		under = b[1]
		objdict[above]["On"] = under
		objdict[under]["Clear"] = False #Sets the under object's clear attribute to False
		objdict[under]["Under"] = above
	elif eachthing[0] == "C": #Identifies 'CLEAR' proposition
		c = eachthing.split("(")
		d = c[1].split(")")[0] #Splits up CLEAR propositions to get the object name
		objdict[d]["Clear"] = True
	elif eachthing[0] == "H": #Identifies 'HEAVIER' proposition
		e = eachthing.split("(")
		f = e[1].split(")")[0]
		f = f.split(',')
		heavier = f[0]
		lighter = f[1]
		if objdict[lighter].get("Weight") in range(50): #If lighter object already has a weight, half the weight by 2
			objdict[lighter]["Weight"] = objdict[lighter].get("Weight")/2
		elif objdict[heavier].get("Weight") in range(100):
			objdict[heavier]["Weight"] = objdict[heavier].get("Weight")/2
		else:
			objdict[heavier]["Weight"] = 100 #If object doesn't have a weight, give it a weight
			objdict[lighter]["Weight"] = 50

def Move(x,y,z):
	if objdict[x]["Clear"] == False: #Check if preconditions allow for move
		return False
	elif objdict[x]["On"] != y:
		return False
	elif objdict[z]["Clear"] == False:
		return False
	elif objdict[z]["Weight"] <= objdict[x]["Weight"]:
		return False
	else: #If all preconditions allow the move, change the states
		objdict[x]["On"] = z
		objdict[y]["Clear"] = True
		objdict[z]["Clear"] = False
		objdict[y]["Under"] = None
		objdict[z]["Under"] = x
		print("Move({},{},{})".format(x, y, z)) #Prints solution
		return True

for goal in G: #Loops through each goal
	g = goal.split('(')[1]
	h = g.split(')')[0]
	if goal[0] == "C": #Identifies goals with "CLEAR"
		cleargoal = h
		if objdict[cleargoal]["Clear"] == True:
			#Item is clear, goal is met
			continue
		else:
			#Find what is on top of cleargoal
			object_ontop = objdict[cleargoal]["Under"] #Gets the object on top of cleargoal
			#Moving the object onto a clear object
			for objectt in objdict: #Finds a clear object to move onto
				if objdict[objectt]["Clear"] == True:
					result = Move(object_ontop, cleargoal, objectt)
					if result == True: #Move complete, goal met
						break
	elif goal[0] == "O": #Identifies goals with "ON"
		h = h.split(',')
		above = h[0] 
		below = h[1] 
		if objdict[above]["On"] == below:
			continue #Goal is met
		else:
			for objectt in objdict:
				if objdict[objectt]["Clear"] == True:
					result = Move(above,below,objectt) #If object in dictionary is clear, move other object onto it
					if result == True:
						break
