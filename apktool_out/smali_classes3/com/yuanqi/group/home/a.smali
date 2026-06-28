.class public final synthetic Lcom/yuanqi/group/home/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/group/home/AppSettingActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/group/home/AppSettingActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/home/a;->a:Lcom/yuanqi/group/home/AppSettingActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/home/a;->a:Lcom/yuanqi/group/home/AppSettingActivity;

    invoke-static {v0, p1}, Lcom/yuanqi/group/home/AppSettingActivity;->H(Lcom/yuanqi/group/home/AppSettingActivity;Landroid/view/View;)V

    return-void
.end method
