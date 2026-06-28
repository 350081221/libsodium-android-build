.class public final synthetic Lt1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/huawei/agconnect/apms/hilog/HiLogAbility;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/huawei/agconnect/apms/hilog/HiLogAbility;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/d;->a:Lcom/huawei/agconnect/apms/hilog/HiLogAbility;

    iput-object p2, p0, Lt1/d;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lt1/d;->a:Lcom/huawei/agconnect/apms/hilog/HiLogAbility;

    iget-object v1, p0, Lt1/d;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/agconnect/apms/hilog/HiLogAbility;->b(Lcom/huawei/agconnect/apms/hilog/HiLogAbility;Ljava/lang/String;)V

    return-void
.end method
