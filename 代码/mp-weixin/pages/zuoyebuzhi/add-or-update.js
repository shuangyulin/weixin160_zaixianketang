(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/zuoyebuzhi/add-or-update"],{"031c":function(e,n,t){"use strict";t.r(n);var i=t("f6eb"),r=t("bb08");for(var a in r)"default"!==a&&function(e){t.d(n,e,(function(){return r[e]}))}(a);t("dfa7");var u,o=t("f0c5"),c=Object(o["a"])(r["default"],i["b"],i["c"],!1,null,"35bb2874",null,!1,i["a"],u);n["default"]=c.exports},"1de9":function(e,n,t){"use strict";(function(e){t("8658"),t("921b");i(t("66fd"));var n=i(t("031c"));function i(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])},"5dc3":function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var i=r(t("a34a"));function r(e){return e&&e.__esModule?e:{default:e}}function a(e,n,t,i,r,a,u){try{var o=e[a](u),c=o.value}catch(s){return void t(s)}o.done?n(c):Promise.resolve(c).then(i,r)}function u(e){return function(){var n=this,t=arguments;return new Promise((function(i,r){var u=e.apply(n,t);function o(e){a(u,i,r,o,c,"next",e)}function c(e){a(u,i,r,o,c,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("1cc1"))}.bind(null,t)).catch(t.oe)},c={data:function(){return{ruleForm:{kechengmingcheng:"",kechengleixing:"",tupian:"",nianji:"",faburiqi:"",banji:"",xueqi:"",zuoyeyaoqiu:"",jiaoshigonghao:"",jiaoshixingming:""},user:{},ro:{kechengmingcheng:!1,kechengleixing:!1,tupian:!1,nianji:!1,faburiqi:!1,banji:!1,xueqi:!1,zuoyeyaoqiu:!1,jiaoshigonghao:!1,jiaoshixingming:!1}}},components:{wPicker:o},computed:{},onLoad:function(){var n=u(i.default.mark((function n(t){var r,a,u,o;return i.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:return this.ruleForm.faburiqi=this.$utils.getCurDate(),r=e.getStorageSync("nowTable"),n.next=4,this.$api.session(r);case 4:if(a=n.sent,this.user=a.data,this.ruleForm.userid=e.getStorageSync("userid"),t.refid&&(this.ruleForm.refid=t.refid,this.ruleForm.nickname=e.getStorageSync("nickname")),!t.id){n.next=14;break}return this.ruleForm.id=t.id,n.next=12,this.$api.info("zuoyebuzhi",this.ruleForm.id);case 12:a=n.sent,this.ruleForm=a.data;case 14:if(!t.cross){n.next=61;break}u=e.getStorageSync("crossObj"),n.t0=i.default.keys(u);case 17:if((n.t1=n.t0()).done){n.next=61;break}if(o=n.t1.value,"kechengmingcheng"!=o){n.next=23;break}return this.ruleForm.kechengmingcheng=u[o],this.ro.kechengmingcheng=!0,n.abrupt("continue",17);case 23:if("kechengleixing"!=o){n.next=27;break}return this.ruleForm.kechengleixing=u[o],this.ro.kechengleixing=!0,n.abrupt("continue",17);case 27:if("tupian"!=o){n.next=31;break}return this.ruleForm.tupian=u[o],this.ro.tupian=!0,n.abrupt("continue",17);case 31:if("nianji"!=o){n.next=35;break}return this.ruleForm.nianji=u[o],this.ro.nianji=!0,n.abrupt("continue",17);case 35:if("faburiqi"!=o){n.next=39;break}return this.ruleForm.faburiqi=u[o],this.ro.faburiqi=!0,n.abrupt("continue",17);case 39:if("banji"!=o){n.next=43;break}return this.ruleForm.banji=u[o],this.ro.banji=!0,n.abrupt("continue",17);case 43:if("xueqi"!=o){n.next=47;break}return this.ruleForm.xueqi=u[o],this.ro.xueqi=!0,n.abrupt("continue",17);case 47:if("zuoyeyaoqiu"!=o){n.next=51;break}return this.ruleForm.zuoyeyaoqiu=u[o],this.ro.zuoyeyaoqiu=!0,n.abrupt("continue",17);case 51:if("jiaoshigonghao"!=o){n.next=55;break}return this.ruleForm.jiaoshigonghao=u[o],this.ro.jiaoshigonghao=!0,n.abrupt("continue",17);case 55:if("jiaoshixingming"!=o){n.next=59;break}return this.ruleForm.jiaoshixingming=u[o],this.ro.jiaoshixingming=!0,n.abrupt("continue",17);case 59:n.next=17;break;case 61:this.styleChange();case 62:case"end":return n.stop()}}),n,this)})));function t(e){return n.apply(this,arguments)}return t}(),methods:{styleChange:function(){this.$nextTick((function(){}))},faburiqiChange:function(e){this.ruleForm.faburiqi=e.target.value,this.$forceUpdate()},tupianTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.tupian=e.$base.url+"upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},zuoyeyaoqiuTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.zuoyeyaoqiu=e.$base.url+"upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=u(i.default.mark((function e(){return i.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!this.ruleForm.id){e.next=5;break}return e.next=3,this.$api.update("zuoyebuzhi",this.ruleForm);case 3:e.next=7;break;case 5:return e.next=7,this.$api.add("zuoyebuzhi",this.ruleForm);case 7:this.$utils.msgBack("提交成功");case 8:case"end":return e.stop()}}),e,this)})));function n(){return e.apply(this,arguments)}return n}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,t=n.getFullYear(),i=n.getMonth()+1,r=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),i=i>9?i:"0"+i,r=r>9?r:"0"+r,"".concat(t,"-").concat(i,"-").concat(r)},toggleTab:function(e){this.$refs[e].show()}}};n.default=c}).call(this,t("543d")["default"])},bb08:function(e,n,t){"use strict";t.r(n);var i=t("5dc3"),r=t.n(i);for(var a in i)"default"!==a&&function(e){t.d(n,e,(function(){return i[e]}))}(a);n["default"]=r.a},dfa7:function(e,n,t){"use strict";var i=t("ed81"),r=t.n(i);r.a},ed81:function(e,n,t){},f6eb:function(e,n,t){"use strict";var i,r=function(){var e=this,n=e.$createElement;e._self._c},a=[];t.d(n,"b",(function(){return r})),t.d(n,"c",(function(){return a})),t.d(n,"a",(function(){return i}))}},[["1de9","common/runtime","common/vendor"]]]);