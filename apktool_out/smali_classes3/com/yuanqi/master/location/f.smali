.class public final synthetic Lcom/yuanqi/master/location/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/master/location/MapActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/master/location/MapActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/location/f;->a:Lcom/yuanqi/master/location/MapActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/location/f;->a:Lcom/yuanqi/master/location/MapActivity;

    invoke-static {v0, p1}, Lcom/yuanqi/master/location/MapActivity;->K(Lcom/yuanqi/master/location/MapActivity;Landroid/view/View;)V

    return-void
.end method
