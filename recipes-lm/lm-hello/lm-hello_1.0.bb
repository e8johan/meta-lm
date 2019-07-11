SUMMARY = "Hello World program for Linux Magazin"
SECTION = "examples"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCREV = "6c2970ab5277e23f55de9853a38c6c173d0b04ee"
SRC_URI = "git://github.com/e8johan/lm-hello.git"

PV = "1.0+git${SRCPV}"

S = "${WORKDIR}/git/"

EXTRA_OEMAKE = "'CC=${CC}' 'CFLAGS=${CFLAGS}' 'LDFLAGS=${LDFLAGS}'"
TARGET_CC_ARCH += "${LDFLAGS}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 lm-hello ${D}${bindir}
}
