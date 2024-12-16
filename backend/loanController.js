const express = require("express");
const router = express.Router();

router.get("/", (req, res) => {
    res.send("Loan information");
});

module.exports = router;
