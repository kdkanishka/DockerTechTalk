import time

while True:
	time.sleep(2)
	with open("/tmp/requester.log", "a") as myfile:
		myfile.write("Hello! \n")

