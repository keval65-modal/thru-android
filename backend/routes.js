const express = require("express");
const vendorController = require("./vendorController");
const stockController = require("./stockController");
const loanController = require("./loanController");

const router = express.Router();

router.use("/vendors", vendorController);
router.use("/stocks", stockController);
router.use("/loans", loanController);

module.exports = router;
