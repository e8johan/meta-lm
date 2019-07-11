require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "Minimal image for Linux Magazin"

IMAGE_INSTALL_append = " lm-hello"
