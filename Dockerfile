FROM kbase/kbase:sdkbase.latest
MAINTAINER KBase Developer
# -----------------------------------------
# In this section, you can install any system dependencies required
# to run your App.  For instance, you could place an apt-get update or
# install line here, a git checkout to download code, or run any other
# installation scripts.

RUN apt-get update

# Here we install a python coverage tool and an
# https library that is out of date in the base image.

RUN pip install coverage

# update security libraries in the base image
RUN pip install cffi --upgrade \
    && pip install pyopenssl --upgrade \
    && pip install ndg-httpsclient --upgrade \
    && pip install pyasn1 --upgrade \
    && pip install requests --upgrade \
    && pip install 'requests[security]' --upgrade

# To install all the dependencies
RUN apt-get install -y build-essential wget make curl unzip python

# To download the Maxbin software and untar it
RUN cd /kb/dev_container/modules && \
    mkdir MaxBin && cd MaxBin && \
    wget https://sourceforge.net/projects/maxbin2/files/MaxBin-2.2.1.tar.gz/download &&\
    tar xvf download && \
    cd MaxBin-2.2.1/src && \
    make && \
    cd .. && \
    ./autobuild_auxiliary && \
    cd .. && \
    cp -R MaxBin-2.2.1 /kb/deployment/bin/MaxBin

# -----------------------------------------

COPY ./ /kb/module
RUN mkdir -p /kb/module/work
RUN chmod -R a+rw /kb/module

WORKDIR /kb/module

RUN make all

ENTRYPOINT [ "./scripts/entrypoint.sh" ]

CMD [ ]
