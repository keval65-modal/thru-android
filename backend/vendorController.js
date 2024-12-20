const express = require("express");
const router = express.Router();
const VendorService = require("./vendorService");

router.get("/vendors", (req, res) => {
    const vendors = VendorService.getVendors();
    res.json(vendors);
});

module.exports = router;
