package com.pssys.common.persistence.entity;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

/**
 * 树形结构的继承该类即可
 * @author zengyufei
 * 2016-5-9 下午9:46:34
 * @param <ID>
 */
@MappedSuperclass
public abstract class TreeEntity<ID extends Serializable> extends BaseEntity<ID> {

    private static final long serialVersionUID = 1L;
	
    /**
     * 父级ID
     */
    private ID parentId;
    /*  
     * @OneToMany: 指明Order 与OrderItem关联关系为一对多关系 
     *  
     * mappedBy: 定义类之间的双向关系。如果类之间是单向关系，不需要提供定义，如果类和类之间形成双向关系，我们就需要使用这个属性进行定义， 
     * 否则可能引起数据一致性的问题。
     * mappedBy = "children"：意思是说这里的一对一配置参考了children
     * children又是什么呢?children是@ManyToOne类中的getChildren(),注意不是@ManyToOne类中的
     * children属性,@ManyToOne类中的配置就是在getChildren()方法上面配的.
     * 如果@ManyToOne类中的getChildren()方法改成getIdChildren(),其他不变的话,
     * 这里就要写成：mappedBy = "idChildren"
     *  
     * cascade: CascadeType[]类型。该属性定义类和类之间的级联关系。定义的级联关系将被容器视为对当前类对象及其关联类对象采取相同的操作， 
     * 而且这种关系是递归调用的。举个例子：Order 和OrderItem有级联关系，那么删除Order 时将同时删除它所对应的OrderItem对象。 
     * 而如果OrderItem还和其他的对象之间有级联关系，那么这样的操作会一直递归执行下去。cascade的值只能从CascadeType.PERSIST（级联新建）、 
     * CascadeType.REMOVE（级联删除）、CascadeType.REFRESH（级联刷新）、CascadeType.MERGE（级联更新）中选择一个或多个。 
     * 还有一个选择是使用CascadeType.ALL，表示选择全部四项。 
     *  
     * fatch: 可选择项包括：FetchType.EAGER 和FetchType.LAZY。前者表示关系类(本例是OrderItem类)在主类(本例是Order类)加载的时候 
     * 同时加载;后者表示关系类在被访问时才加载,默认值是FetchType. LAZY。 
     *  @JoinColumn:主表外键字段
      * cid：Person所映射的表中的一个字段
     */  
    
    /**
     * 所有父级ID
     */
    private String parentIds;
    
    /**
     * 子类
     */
    private String children;
    /* 
     * @ManyToOne指明OrderItem和Order之间为多对一关系，多个OrderItem实例关联的都是同一个Order对象。 
     * 其中的属性和@OneToMany基本一样，但@ManyToOne注释的fetch属性默认值是FetchType.EAGER。 
     *  
     * optional 属性是定义该关联类对是否必须存在，值为false时，关联类双方都必须存在，如果关系被维护端不存在，查询的结果为null。 
     * 值为true 时, 关系被维护端可以不存在，查询的结果仍然会返回关系维护端，在关系维护端中指向关系被维护端的属性为null。 
     * optional 属性的默认值是true。举个例：某项订单(Order)中没有订单项(OrderItem)，如果optional 属性设置为false， 
     * 获取该项订单（Order）时，得到的结果为null，如果optional 属性设置为true，仍然可以获取该项订单，但订单中指向订单项的属性为null。 
     * 实际上在解释Order 与OrderItem的关系成SQL时，optional 属性指定了他们的联接关系optional=false联接关系为inner join,  
     * optional=true联接关系为left join。 
     *  
     * @JoinColumn:指明了被维护端（OrderItem）的外键字段为order_id，它和维护端的主键(orderid)连接,unique= true 指明order_id列的值不可重复。 
     */  
    
    /**
     * 排序
     */
    private String sort;

	public ID getParentId() {
    	return parentId;
    }

	public void setParentId(ID parentId) {
    	this.parentId = parentId;
    }

	public String getParentIds() {
    	return parentIds;
    }

	public void setParentIds(String parentIds) {
    	this.parentIds = parentIds;
    }

	public String getChildren() {
    	return children;
    }

	public void setChildren(String children) {
    	this.children = children;
    }

	public String getSort() {
    	return sort;
    }

	public void setSort(String sort) {
    	this.sort = sort;
    }
    
    
}
