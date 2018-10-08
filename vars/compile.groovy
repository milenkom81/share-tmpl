#!groovy


def call(String repo = 'repo') {
	git '${repo}'
}
