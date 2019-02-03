 lbs-cache  
 ====
 
 用于提高基站定位服务（LBS）效率的缓存服务器， 可以减少付费基站定位API的调用次数。
 
 简介  
 -------  
 基于 Spring Boot 、 MyBatis ，通过将LBS请求结果计入数据库中实现缓存功能。
 可以扩展基站定位服务功能例如多基站定位。
 
 功能
 -------  
 
   >中转并缓存基站数据  
    缓存定时过期  
    _日志记录（开发中）_  
    _多基站定位（开发中）_
 
 使用方法
 -------  
    1. 运行 sql/lbs-cache.sql
    2. 在 application.yml 中添加数据库和API配置
    3. 在 model/LbsData 类中修改toParam()方法
    
 
 
 LICENSE
 -------  
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
 
        http://www.apache.org/licenses/LICENSE-2.0
 
     Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.