const express = require("express");
const router = express.Router();

router.get("/loans", (req, res) => {
    res.json({ loan: "Loan data will be here" });
});

module.exports = router;
