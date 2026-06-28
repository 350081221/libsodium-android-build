.class public final Lcom/huawei/agconnect/apms/instrument/FragmentInstrumentation$abc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/apms/instrument/FragmentInstrumentation;->onResumeFragmentEnd(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic abc:Ljava/lang/String;

.field public final synthetic bcd:Lcom/huawei/agconnect/apms/l0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/huawei/agconnect/apms/l0;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/instrument/FragmentInstrumentation$abc;->abc:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/agconnect/apms/instrument/FragmentInstrumentation$abc;->bcd:Lcom/huawei/agconnect/apms/l0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    new-instance v0, Lcom/huawei/agconnect/apms/collect/model/event/interaction/PageLoadEvent;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/huawei/agconnect/apms/instrument/FragmentInstrumentation$abc;->abc:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/huawei/agconnect/apms/instrument/FragmentInstrumentation$abc;->bcd:Lcom/huawei/agconnect/apms/l0;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lcom/huawei/agconnect/apms/collect/model/event/interaction/PageLoadEvent;-><init>(Ljava/lang/String;Lcom/huawei/agconnect/apms/l0;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/huawei/agconnect/apms/yza;->abc(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
