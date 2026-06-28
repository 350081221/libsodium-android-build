.class final Lcom/huawei/agconnect/credential/obs/al$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/instance/CallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/credential/obs/al;->syncOaid(Lcom/huawei/agconnect/credential/obs/ai;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/agconnect/credential/obs/ai;

.field final synthetic b:Lcom/huawei/agconnect/credential/obs/al;


# direct methods
.method constructor <init>(Lcom/huawei/agconnect/credential/obs/al;Lcom/huawei/agconnect/credential/obs/ai;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/al$1;->b:Lcom/huawei/agconnect/credential/obs/al;

    iput-object p2, p0, Lcom/huawei/agconnect/credential/obs/al$1;->a:Lcom/huawei/agconnect/credential/obs/ai;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onResult(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/al$1;->a:Lcom/huawei/agconnect/credential/obs/ai;

    invoke-interface {v0, p1, p2}, Lcom/huawei/agconnect/credential/obs/ai;->result(ILjava/lang/String;)V

    return-void
.end method
