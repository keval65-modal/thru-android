const express = require("express");
const router = express.Router();

router.get("/stocks", (req, res) => {
    res.json({ stock: "Stock data will be here" });
});

module.exports = router;
