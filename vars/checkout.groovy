#!/usr/bin/env groovy
// vars/checkOut.groovy

def call(String repo = 'repo') {
	git '${repo}'
}