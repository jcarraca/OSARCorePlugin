function OSARCorePlugin() {}

OSARCorePlugin.prototype.open = function(success, fail) {
	console.log('Entrei');
	cordova.exec(success, fail, 'OSARCorePlugin', 'open', []);
};

OSARCorePlugin.install = function() {
  if (!window.plugins) {
    window.plugins = {};
  }
  window.plugins.OSARCorePlugin = new OSARCorePlugin();
  return window.plugins.OSARCorePlugin;
};

cordova.addConstructor(OSARCorePlugin.install);