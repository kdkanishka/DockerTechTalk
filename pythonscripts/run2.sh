#!/bin/bash

docker run --name randomnumbers2 \
	--memory=256m \
	-v /var/log/services/randomnumbers2:/tmp \
	-itd creative/randomnumbers:1.0

