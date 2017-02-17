package cn.edu.bnuz.bell.tm.core.api

class UrlMappings {

    static mappings = {
        // 公共服务
        "/fields"(resources: 'field', includes: ['index'])

        "/teachers"(resources: 'teacher', includes: ['index'])

        "/departments"(resources: 'department', includes: ['index'])

        "/workflows"(resources: 'workflow', includes: []) {
            "/workitems"(action: 'workitems', includes: ['index'], method: 'GET')
        }

        "/menus"(resources: 'menu', includes: ['index'])

        // 按用户获取信息
        "/users"(resources: 'user', includes: []) {
            "/profile"(resource: 'profile', includes: ['show', 'update'])
            "/works"(resources: 'workitem', includes: ['index'])
        }

        "500"(view: '/error')
        "404"(view: '/notFound')
        "403"(view: '/forbidden')
        "401"(view: '/unauthorized')
    }
}
