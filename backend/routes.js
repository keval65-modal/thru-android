const vendorController = require("./vendorController");
const stockController = require("./stockController");
const loanController = require("./loanController");

module.exports = (app) => {
    app.use("/api", vendorController);
    app.use("/api", stockController);
    app.use("/api", loanController);
};
