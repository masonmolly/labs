#Written in Python 3.6.1
#By Molly Mason
#Problem Solving for CS 2017 assignment retake
import sys

class Student:
	def __init__(self, name, surname):
		self.forename = name
		self.surname = surname
		self.grades = []
		self.database = []

	def getSurname(self):
		return self.surname

	def getName(self):
		return self.forename

	def getGrades(self):
		return self.grades

	def getHours(self):
		total_hours = 0.0
		for grade in self.grades:
			total_hours += grade[1]

		return total_hours

	def getQPoints(self):
		total_qpoints = 0.0
		for mark, credit_hours in self.grades:
			total_qpoints += mark*credit_hours
		return total_qpoints

	def getGPA(self):
		hours = self.getHours()
		if hours == 0.0:
			return None
		return self.getQPoints()/hours

	def addGrade(self, gradeStr, credHours):
		letter_grades = {"A": 4.0, "B": 3.0, "C": 2.0, "D": 1.0}
		score = letter_grades[gradeStr[0]]
		if gradeStr[-1] == '-':
			score -= 0.3
		elif gradeStr[-1] == '+':
			score += 0.3
		self.grades.append((score, credHours))

	def __str__(self):
		if self.getGrades() == 0.0:
			return "{}, {}: []; GPA: None".format(self.surname, self.forename)
		else:
			return "{}, {}: {}; GPA: {}".format(self.surname, self.forename,
											str(self.grades), self.getGPA())

def in_database(database, first_name, last_name):
	for names in database:
		if names.forename == first_name and names.surname == last_name:
			return names
	return False

def main():
	database = []
	options = ['N', 'R', 'A', 'S', 'X']
	choice = input("""Would you like to add a new student (N),remove a student (R),
		add a grade (A), sort the students (S), or exit (X)? """)
	while True:
		while choice not in options:
			choice = input("Please input a valid option: ")
		if choice == options[0]:
			first_name, last_name = input("Please enter the new student's forename and surname: ").split()
			if in_database(database, first_name, last_name):
				print("Student already exists.")
			else:
				print("Student successfully added.")
				new_student_object = Student(first_name, last_name)
				database.append(new_student_object)
		elif choice == options[1]:
			first_name, last_name = input("Please enter the existing student's forename and surname: ").split()
			remove_student = in_database(database, first_name, last_name)
			if remove_student:
				print("Student successfully removed.")
				database.remove(remove_student)
			else:
				print("Student does not exist.")
		elif choice == options[2]:
			first_name, last_name = input("Please enter the student's forename and surname: ").split()
			student_object = in_database(database, first_name, last_name)
			if not student_object:
				print("Student does not exist.")
			else:
				student_grade = input("Please enter the student's grade: ")
				student_credit_hours = float(input("Please enter the student's credit hours: "))
				student_object.addGrade(student_grade, student_credit_hours)
		elif choice == options[3]:
			for name in sorted(database, key=lambda x: x.surname):
				print(name)
		elif choice == options[4]:
			print("Exiting the program...")
			sys.exit()
		choice = input("Now make another choice: ")

main()







