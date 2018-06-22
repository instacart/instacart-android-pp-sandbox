#!/bin/bash

zip_filename=instacart-pp-$(whoami).zip
pwd=$(pwd)


echo "-- cleaning build files"
rm -rf build

zip -r $pwd/../$zip_filename $pwd/*