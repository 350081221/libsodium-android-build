.class public Lmirror/android/app/Instrumentation;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static TYPE:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static execStartActivity:Lmirror/RefMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefMethod<",
            "Landroid/app/Instrumentation$ActivityResult;",
            ">;"
        }
    .end annotation

    .annotation runtime Lmirror/MethodParams;
        value = {
            Landroid/content/Context;,
            Landroid/os/IBinder;,
            Landroid/os/IBinder;,
            Lmirror/android/app/Activity;,
            Landroid/content/Intent;,
            I,
            Landroid/os/Bundle;
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lmirror/android/app/Instrumentation;

    const-class v1, Landroid/app/Instrumentation;

    invoke-static {v0, v1}, Lmirror/RefClass;->load(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lmirror/android/app/Instrumentation;->TYPE:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
