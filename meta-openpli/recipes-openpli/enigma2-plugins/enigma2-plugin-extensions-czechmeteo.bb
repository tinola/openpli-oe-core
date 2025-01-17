DESCRIPTION = "Czech meteo information viewer plugin"
MAINTAINER = "ims"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9432c1f3d564948269193fd19a0ad0fd"

RDEPENDS_${PN} = "\
	${PYTHON_PN}-requests \
	"

inherit gitpkgv
PV = "2.0+git${SRCPV}"
PKGV = "2.0+git${GITPKGV}"

SRC_URI = "git://github.com/ims21/CzechMeteo.git;protocol=https"

S="${WORKDIR}/git"

inherit distutils-openplugins python3-compileall
