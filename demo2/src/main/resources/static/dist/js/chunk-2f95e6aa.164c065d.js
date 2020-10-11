(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2f95e6aa"],{"27ca":function(e,t,a){"use strict";var l=a("6b47"),s=a.n(l);s.a},"2fb8":function(e,t,a){"use strict";a.r(t);var l=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticStyle:{height:"600px"}},[a("el-table",{staticStyle:{width:"100%",height:"480px"},attrs:{data:e.tableData.filter((function(t){return!e.search||t.name.toLowerCase().includes(e.search.toLowerCase())})),stripe:""}},[a("el-table-column",{attrs:{label:"Id",prop:"id"}}),a("el-table-column",{attrs:{label:"Name",prop:"name"}}),a("el-table-column",{attrs:{label:"Gender",prop:"gender"}}),a("el-table-column",{attrs:{label:"Birth",prop:"birth",formatter:e.formatDate}}),a("el-table-column",{attrs:{label:"Edu",prop:"edu"}}),a("el-table-column",{attrs:{label:"Contact",prop:"contact"}}),a("el-table-column",{attrs:{label:"Politicestatus",prop:"politicestatus"}}),a("el-table-column",{attrs:{label:"Major",prop:"major"}}),a("el-table-column",{attrs:{align:"right"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("el-button",{attrs:{size:"mini"},on:{click:function(a){return e.handleEdit(t.$index,t.row)}}},[e._v("Edit")]),a("el-button",{attrs:{size:"mini",type:"danger"},on:{click:function(a){return e.handleDelete(t.$index,t.row)}}},[e._v("Delete")])]}}])},[a("template",{slot:"header"},[a("el-input",{attrs:{size:"mini",placeholder:"输入关键字搜索"},model:{value:e.search,callback:function(t){e.search=t},expression:"search"}})],1)],2)],1),a("el-row",{staticStyle:{margin:"30px 0px"}},[a("el-col",{attrs:{span:10,offset:14}},[a("div",{staticClass:"block"},[a("el-pagination",{attrs:{layout:"prev, pager, next,jumper,sizes","page-size":e.pagesize,"current-page":e.currentpage,"prev-text":"上一页","next-text":"下一页",small:"",background:"","page-sizes":[2,4,6],total:e.total},on:{"current-change":e.findPage,"size-change":e.changeSize}})],1)])],1),a("el-button",{staticStyle:{margin:"0px 0px"},attrs:{type:"success",size:"medium"},on:{click:e.showChange}},[e._v("添加")]),a("div",{class:e.theclass},[a("transition",{attrs:{name:"el-fade-in-linear"}},[e.show?a("div",{staticClass:"transition-box"},[a("el-form",{ref:"form",staticStyle:{width:"300px"},attrs:{model:e.form,"label-width":"80px",resetFields:""}},[a("el-form-item",[e._v("添加学生信息")]),a("el-form-item",{attrs:{label:"学生id"}},[a("el-input",{model:{value:e.form.id,callback:function(t){e.$set(e.form,"id",t)},expression:"form.id"}})],1),a("el-form-item",{attrs:{label:"学生姓名"}},[a("el-input",{model:{value:e.form.name,callback:function(t){e.$set(e.form,"name",t)},expression:"form.name"}})],1),a("el-form-item",{attrs:{label:"密码"}},[a("el-input",{attrs:{"show-password":""},model:{value:e.form.password,callback:function(t){e.$set(e.form,"password",t)},expression:"form.password"}})],1),a("el-form-item",{attrs:{label:"性别"}},[a("el-radio-group",{model:{value:e.form.gender,callback:function(t){e.$set(e.form,"gender",t)},expression:"form.gender"}},[a("el-radio",{attrs:{label:"男"}}),a("el-radio",{attrs:{label:"女"}})],1)],1),a("el-form-item",{staticStyle:{width:"400px"},attrs:{label:"出生日期"}},[a("el-col",{attrs:{span:11}},[a("el-date-picker",{attrs:{type:"date",placeholder:"选择日期",format:"yyyy-MM-dd","value-format":"yyyy-MM-dd"},model:{value:e.form.birth,callback:function(t){e.$set(e.form,"birth",t)},expression:"form.birth"}})],1)],1),a("el-form-item",{attrs:{label:"民族"}},[a("el-input",{model:{value:e.form.nation,callback:function(t){e.$set(e.form,"nation",t)},expression:"form.nation"}})],1),a("el-form-item",{attrs:{label:"学历"}},[a("el-select",{attrs:{placeholder:"请选择"},model:{value:e.form.edu,callback:function(t){e.$set(e.form,"edu",t)},expression:"form.edu"}},e._l(e.options,(function(e){return a("el-option",{key:e.value,attrs:{label:e.label,value:e.value}})})),1)],1),a("el-form-item",{attrs:{label:"联系方式"}},[a("el-input",{model:{value:e.form.contact,callback:function(t){e.$set(e.form,"contact",t)},expression:"form.contact"}})],1),a("el-form-item",{attrs:{label:"专业"}},[a("el-input",{model:{value:e.form.major,callback:function(t){e.$set(e.form,"major",t)},expression:"form.major"}})],1),a("el-form-item",{attrs:{label:"email"}},[a("el-input",{model:{value:e.form.email,callback:function(t){e.$set(e.form,"email",t)},expression:"form.email"}})],1),a("el-form-item",[a("el-button",{attrs:{type:"primary"},on:{click:e.onSubmit}},[e._v("立即创建")]),a("el-button",{on:{click:function(t){return e.resetForm("form")}}},[e._v("取消")])],1)],1)],1):e._e()])],1),a("div",{class:e.Secondclass},[a("el-collapse-transition",[e.show1?a("div",[a("div",{staticClass:"transition-box1"},[a("el-form",{ref:"updates",staticStyle:{width:"300px"},attrs:{model:e.form,"label-width":"80px",resetFields:""}},[a("el-form-item",[e._v("修改学生信息")]),a("el-form-item",{attrs:{label:"学生id"}},[a("el-input",{model:{value:e.updates.id,callback:function(t){e.$set(e.updates,"id",t)},expression:"updates.id"}})],1),a("el-form-item",{attrs:{label:"学生姓名"}},[a("el-input",{model:{value:e.updates.name,callback:function(t){e.$set(e.updates,"name",t)},expression:"updates.name"}})],1),a("el-form-item",{attrs:{label:"密码"}},[a("el-input",{attrs:{"show-password":""},model:{value:e.updates.password,callback:function(t){e.$set(e.updates,"password",t)},expression:"updates.password"}})],1),a("el-form-item",{attrs:{label:"性别"}},[a("el-radio-group",{model:{value:e.updates.gender,callback:function(t){e.$set(e.updates,"gender",t)},expression:"updates.gender"}},[a("el-radio",{attrs:{label:"男"}}),a("el-radio",{attrs:{label:"女"}})],1)],1),a("el-form-item",{staticStyle:{width:"400px"},attrs:{label:"出生日期"}},[a("el-col",{attrs:{span:11}},[a("el-date-picker",{attrs:{type:"date",placeholder:"选择日期",format:"yyyy-MM-dd","value-format":"yyyy-MM-dd"},model:{value:e.updates.birth,callback:function(t){e.$set(e.updates,"birth",t)},expression:"updates.birth"}})],1)],1),a("el-form-item",{attrs:{label:"民族"}},[a("el-input",{model:{value:e.updates.nation,callback:function(t){e.$set(e.updates,"nation",t)},expression:"updates.nation"}})],1),a("el-form-item",{attrs:{label:"学历"}},[a("el-select",{attrs:{placeholder:"请选择"},model:{value:e.updates.edu,callback:function(t){e.$set(e.updates,"edu",t)},expression:"updates.edu"}},e._l(e.options,(function(e){return a("el-option",{key:e.value,attrs:{label:e.label,value:e.value}})})),1)],1),a("el-form-item",{attrs:{label:"联系方式"}},[a("el-input",{model:{value:e.updates.contact,callback:function(t){e.$set(e.updates,"contact",t)},expression:"updates.contact"}})],1),a("el-form-item",{attrs:{label:"专业"}},[a("el-input",{model:{value:e.updates.major,callback:function(t){e.$set(e.updates,"major",t)},expression:"updates.major"}})],1),a("el-form-item",{attrs:{label:"email"}},[a("el-input",{model:{value:e.updates.email,callback:function(t){e.$set(e.updates,"email",t)},expression:"updates.email"}})],1),a("el-form-item",[a("el-button",{attrs:{type:"primary"},on:{click:e.onUpdate}},[e._v("确定修改")]),a("el-button",{on:{click:function(t){return e.resetForm("updates")}}},[e._v("取消")])],1)],1)],1)]):e._e()])],1)],1)},s=[],o={name:"Userlist",data:function(){return{currentpage:1,pagesize:4,total:0,theclass:"static1",Secondclass:"updatestatic",tableData:[],search:"",show:!1,show1:!1,form:{id:"",name:"",password:"",gender:"男",birth:"",edu:"",nation:"",contact:"",major:"",email:""},updates:{id:null,name:"",password:"",gender:"男",birth:"",edu:"",nation:"",contact:"",major:"",email:""},returnMessage:"",options:[{value:"本科",label:"本科"},{value:"大专",label:"大专"},{value:"硕士",label:"硕士"},{value:"博士",label:"博士"},{value:"研究生",label:"研究生"}]}},methods:{formatDate:function(e,t){var a=e[t.property];if(null==a)return null;var l=new Date(a);return l.getFullYear()+"-"+(l.getMonth()+1)+"-"+l.getDate()},findPage:function(e){this.currentpage=e,this.findAllStudent(e,this.pagesize)},changeSize:function(e){this.pagesize=e,this.findAllStudent(this.currentpage,e)},handleEdit:function(e,t){1==this.show&&this.resetForm(this.form),console.log(e,t),this.show1=!0,this.Secondclass="updateactive";var a=this,l="http://localhost:8989/stu/selectOneStu/"+t.id;this.$http.get(l).then((function(e){console.log(e.data.msg),a.updates=e.data.data}))},handleDelete:function(e,t){var a=this;console.log(e,t),this.$confirm("此操作将永久删除该学生信息, 是否继续?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then((function(){a.deleteStudentById(t.id)})).catch((function(){a.$message({type:"info",message:"已取消删除"})}))},showChange:function(){1==this.show1&&this.resetForm(this.updates),this.show=!0,this.theclass="active1"},resetForm:function(e){1==this.show&&(this.show=!1,this.theclass="static1"),1==this.show1&&(this.show1=!1,this.Secondclass="updatestatic"),this.$refs[e].resetFields(),this.form={},this.form.gender="男",this.updates={},this.updates.gender="男"},onUpdate:function(){var e=this;this.$confirm("确定修改?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then((function(){e.updateStudent()})).catch((function(){e.$message({type:"info",message:"已取消修改"})}))},onSubmit:function(){var e=this,t=this;this.$http.post("http://localhost:8989/teacher/addStudent",this.form).then((function(a){console.log(t.form),console.log(a.data.msg),t.returnMessage=a.data.msg,e.$message(e.returnMessage),t.resetForm("form"),t.findAllStudent()})).catch((function(a){console.log(t.form),t.resetForm("form"),e.$message("添加学生失败！")}))},findAllStudent:function(e,t){var a=this;e=e||a.currentpage,t=t||a.pagesize;var l="http://localhost:8989/teacher/queryUser/"+e+"/"+t;this.$http.get(l).then((function(e){a.tableData=e.data.studentsList,a.total=e.data.total}))},deleteStudentById:function(e){var t=this,a="http://localhost:8989/teacher/deleteStudent/"+e;this.$http.get(a).then((function(e){t.findAllStudent(),t.$message({type:"success",message:"删除成功!"})})).catch((function(e){t.$message.error("删除学生失败")}))},updateStudent:function(){var e=this,t=this;this.$http.post("http://localhost:8989/stu/update",this.updates).then((function(a){console.log(a.data.msg),t.returnMessage=a.data.msg,e.$message(e.returnMessage),t.resetForm("updates"),t.findAllStudent()})).catch((function(a){t.resetForm("updates"),e.$message("修改学生失败！")}))}},created:function(){this.findAllStudent()}},n=o,r=(a("27ca"),a("2877")),i=Object(r["a"])(n,l,s,!1,null,null,null);t["default"]=i.exports},"6b47":function(e,t,a){}}]);
//# sourceMappingURL=chunk-2f95e6aa.164c065d.js.map