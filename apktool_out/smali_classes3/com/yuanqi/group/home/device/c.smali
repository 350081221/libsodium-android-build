.class public final synthetic Lcom/yuanqi/group/home/device/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/group/home/device/DeviceFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/group/home/device/DeviceFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/home/device/c;->a:Lcom/yuanqi/group/home/device/DeviceFragment;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6

    iget-object v0, p0, Lcom/yuanqi/group/home/device/c;->a:Lcom/yuanqi/group/home/device/DeviceFragment;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    invoke-static/range {v0 .. v5}, Lcom/yuanqi/group/home/device/DeviceFragment;->b(Lcom/yuanqi/group/home/device/DeviceFragment;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method
