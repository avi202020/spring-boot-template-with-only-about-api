#!/usr/bin/env bash

wrk -t12 -c800 -d100s http://127.0.0.1:8080/about