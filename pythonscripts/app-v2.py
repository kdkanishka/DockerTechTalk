#!/usr/bin/env python
 
import requests
import time

while True:
	time.sleep(2)
	r = requests.get('https://www.random.org/integers/?num=1&min=1&max=100&col=1&base=10&format=plain&rnd=new', auth=('user', 'pass'))
	#print r.status_code
	#print(r.text)
	with open("/tmp/requester.log", "a") as myfile:
		myfile.write(r.text)

