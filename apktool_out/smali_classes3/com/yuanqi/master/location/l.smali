.class public final synthetic Lcom/yuanqi/master/location/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/master/location/MapActivity;

.field public final synthetic b:Lcom/yqtech/multiapp/databinding/ActivityMapBinding;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/location/l;->a:Lcom/yuanqi/master/location/MapActivity;

    iput-object p2, p0, Lcom/yuanqi/master/location/l;->b:Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/location/l;->a:Lcom/yuanqi/master/location/MapActivity;

    iget-object v1, p0, Lcom/yuanqi/master/location/l;->b:Lcom/yqtech/multiapp/databinding/ActivityMapBinding;

    invoke-static {v0, v1, p1}, Lcom/yuanqi/master/location/MapActivity;->O(Lcom/yuanqi/master/location/MapActivity;Lcom/yqtech/multiapp/databinding/ActivityMapBinding;Landroid/view/View;)V

    return-void
.end method
