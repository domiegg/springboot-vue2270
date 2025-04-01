import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import dabianmingdan from '@/views/modules/dabianmingdan/list'
    import ketixinxi from '@/views/modules/ketixinxi/list'
    import shenqingketi from '@/views/modules/shenqingketi/list'
    import tichuyiwen from '@/views/modules/tichuyiwen/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import yuanxixinxi from '@/views/modules/yuanxixinxi/list'
    import mianlunwenshenqing from '@/views/modules/mianlunwenshenqing/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import leixingxinxi from '@/views/modules/leixingxinxi/list'
    import daoshi from '@/views/modules/daoshi/list'
    import shangchuanwendang from '@/views/modules/shangchuanwendang/list'
    import users from '@/views/modules/users/list'
    import daoshiketixuanze from '@/views/modules/daoshiketixuanze/list'
    import jinduxinxi from '@/views/modules/jinduxinxi/list'
    import dafenxinxi from '@/views/modules/dafenxinxi/list'
    import daoshixinxi from '@/views/modules/daoshixinxi/list'
    import jiaoshiketixuanze from '@/views/modules/jiaoshiketixuanze/list'
    import wendangfabu from '@/views/modules/wendangfabu/list'
    import tiwenxinxi from '@/views/modules/tiwenxinxi/list'
    import daoshixuanze from '@/views/modules/daoshixuanze/list'
    import banjixinxi from '@/views/modules/banjixinxi/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/dabianmingdan',
        name: '答辩名单',
        component: dabianmingdan
      }
          ,{
	path: '/ketixinxi',
        name: '课题信息',
        component: ketixinxi
      }
          ,{
	path: '/shenqingketi',
        name: '申请课题',
        component: shenqingketi
      }
          ,{
	path: '/tichuyiwen',
        name: '提出疑问',
        component: tichuyiwen
      }
          ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
          ,{
	path: '/yuanxixinxi',
        name: '院系信息',
        component: yuanxixinxi
      }
          ,{
	path: '/mianlunwenshenqing',
        name: '免论文申请',
        component: mianlunwenshenqing
      }
          ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
          ,{
	path: '/leixingxinxi',
        name: '类型信息',
        component: leixingxinxi
      }
          ,{
	path: '/daoshi',
        name: '导师',
        component: daoshi
      }
          ,{
	path: '/shangchuanwendang',
        name: '上传文档',
        component: shangchuanwendang
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
          ,{
	path: '/daoshiketixuanze',
        name: '导师课题选择',
        component: daoshiketixuanze
      }
          ,{
	path: '/jinduxinxi',
        name: '进度信息',
        component: jinduxinxi
      }
          ,{
	path: '/dafenxinxi',
        name: '打分信息',
        component: dafenxinxi
      }
          ,{
	path: '/daoshixinxi',
        name: '导师信息',
        component: daoshixinxi
      }
          ,{
	path: '/jiaoshiketixuanze',
        name: '教师课题选择',
        component: jiaoshiketixuanze
      }
          ,{
	path: '/wendangfabu',
        name: '文档发布',
        component: wendangfabu
      }
          ,{
	path: '/tiwenxinxi',
        name: '提问信息',
        component: tiwenxinxi
      }
          ,{
	path: '/daoshixuanze',
        name: '导师选择',
        component: daoshixuanze
      }
          ,{
	path: '/banjixinxi',
        name: '班级信息',
        component: banjixinxi
      }
          ,{
	path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
