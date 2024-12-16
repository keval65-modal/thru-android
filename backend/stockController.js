const express = require("express");
const router = express.Router();

router.get("/", (req, res) => {
    res.send("Stock information");
});

module.exports = router;
