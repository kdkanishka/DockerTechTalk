#!/bin/bash

docker run --name randomnumbers1 \
	--memory=256m \
	-v /var/log/services/randomnumbers1:/tmp \
	-itd creative/randomnumbers:1.0

