const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmb615y/",
            name: "ssmb615y",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmb615y/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "毕业论文管理系统"
        } 
    }
}
export default base
