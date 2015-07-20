FROM ubuntu
MAINTAINER CSL R&D <kanishka.dilshan@cslworld.com>
VOLUME /var/log
RUN apt-get update
RUN apt-get install python -y
RUN apt-get install python-pip -y
RUN pip install requests
ADD request.py /
USER root
ENTRYPOINT python request.py
