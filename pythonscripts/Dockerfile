FROM ubuntu:18.04
MAINTAINER CSL R&D <kanishka@creativesoftware.com>
VOLUME /tmp
RUN apt-get update
RUN apt-get install python -y
RUN apt-get install python-pip -y
RUN pip install requests
ADD request.py /
USER root
ENTRYPOINT python request.py
